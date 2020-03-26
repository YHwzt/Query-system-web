package com.yc.controller;

import com.yc.beans.User;
import com.yc.beans.Virus;
import com.yc.service.UserService;
import com.yc.service.VirusService;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/virus")
public class VirusController {

    @Autowired
    private VirusService virusService;
    @Autowired
    private UserService userService;
    /** * 将数据写入到excel中 */
    public static void makeExcel(List<List<String>> result,String[] tittle) {
        try {
            // 创建一个workbook对应一个excel文件
            HSSFWorkbook workbook = new HSSFWorkbook();
            // 在workbook中创建一个sheet对应excel中的sheet
            HSSFSheet sheet = workbook.createSheet("病例日期表");
            // 在sheet表中添加表头第0行，旧版本poi对sheet的行列有限制
            HSSFRow row = sheet.createRow(0);
            // 创建单元格，设置表头
            HSSFCell cell = null;
            for (int i = 0; i < tittle.length; i++) {
                cell = row.createCell(i);
                cell.setCellValue(tittle[i]);
            }
            // 写入数据
            for (int i = 0; i < result.size(); i++) {
                List<String> oneData = result.get(i);
                HSSFRow row1 = sheet.createRow(i + 1);
                //创建单元格设值
                for (int j = 0; j < oneData.size(); j++) {
                    row1.createCell(j).setCellValue(oneData.get(j));
                }
            }
            //将文件保存到指定的位置
            FileOutputStream fos = new FileOutputStream("D:\\result.xls");
            workbook.write(fos);
            System.out.println("写入成功");
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @RequestMapping("/export")
    public String export(Virus whereVirus,String startdate1) throws  Exception{

        System.out.println("export..............");
        List<Virus> list = virusService.findAll();
        list=where(list,whereVirus,startdate1);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ArrayList<List<String>> arrayLists = new ArrayList<>();
        for (Virus virus : list) {
            ArrayList<String> strings = new ArrayList<>();
            strings.add(virus.getId()+"");
            strings.add(virus.getUsername()+"");
            strings.add(virus.getCollege()+"");
            strings.add(virus.getProvince()+"");
            strings.add(virus.getAreas()+"");
            strings.add(virus.getCity()+"");
            strings.add(virus.getMyclass()+"");
            strings.add(format.format(virus.getStartdate())+"");
            strings.add(virus.getIsinhubei()?"是":"否"+"");
            strings.add(virus.getIsinwuhan()?"是":"否"+"");
            strings.add(virus.getIs14contact()?"是":"否"+"");
            strings.add(virus.getIsconfirmvirus()?"是":"否"+"");
            strings.add(virus.getIshubeistudent()?"是":"否"+"");
            strings.add(virus.getIslikevirus()?"是":"否"+"");
            strings.add(virus.getIstodayformother()?"是":"否"+"");
            strings.add(virus.getIswuhanstudent()?"是":"否"+"");
            arrayLists.add(strings);
        }
        makeExcel(arrayLists,new String[]{"ID","姓名","学院","省份","城市","区/县","班级","填报日期","是否在湖北","是否在武汉","14天内是否接触过疫情","是否确诊","是否湖北学生","是否疑似","是否今天返校","是否武汉学生"});
        return "forward:findAll";
    }
    public List<Virus> where(List<Virus> list,Virus whereVirus,String startdate1) throws ParseException {
        Iterator<Virus> iterator = list.iterator();
        while (iterator.hasNext()){
            Virus virus = iterator.next();
            if (whereVirus.getUsername()!=null&&!whereVirus.getUsername().equals("")){
                if (!virus.getUsername().equals(whereVirus.getUsername())){
                    iterator.remove();
                    continue;
                }
            }
            if (whereVirus.getCollege()!=null&&!whereVirus.getCollege().equals("")){
                if (!virus.getCollege().equals(whereVirus.getCollege())){
                    iterator.remove();
                    continue;
                }
            }
            if (whereVirus.getMyclass()!=null&&!whereVirus.getMyclass().equals("")){
                if (!virus.getMyclass().equals(whereVirus.getMyclass())){
                    iterator.remove();
                    continue;
                }
            }
            if (startdate1!=null&&!startdate1.equals("")){
                if (!virus.getStartdate().equals(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(startdate1))){
                    iterator.remove();
                    continue;
                }
            }

            if (whereVirus.getProvince()!=null&&!whereVirus.getProvince().equals("")){
                if (!virus.getProvince().equals(whereVirus.getProvince())){
                    iterator.remove();
                    continue;
                }
            }
            if (whereVirus.getCity()!=null&&!whereVirus.getCity().equals("")){
                if (!virus.getCity().equals(whereVirus.getCity())){
                    iterator.remove();
                    continue;
                }
            }
            if (whereVirus.getAreas()!=null&&!whereVirus.getAreas().equals("")){
                if (!virus.getAreas().equals(whereVirus.getAreas())){
                    iterator.remove();
                    continue;
                }
            }
            if (whereVirus.getIsinhubei()!=null&&!whereVirus.getIsinhubei().equals("")){
                if (!virus.getIsinhubei().equals(whereVirus.getIsinhubei())){
                    iterator.remove();
                    continue;
                }
            }
            if (whereVirus.getIsinwuhan()!=null&&!whereVirus.getIsinwuhan().equals("")){
                if (!virus.getIsinwuhan().equals(whereVirus.getIsinwuhan())){
                    iterator.remove();
                    continue;
                }
            }
        }
        return list;
    }
    @RequestMapping("/findAll")
    public String findAll(Model model,Virus whereVirus,String startdate1) throws  Exception{

        List<User> all = userService.findAll();
        Iterator<User> iterator = all.iterator();
        while (iterator.hasNext()){
            User user = iterator.next();
            if (user.getType().equals("2")||user.getType().equals("3")){
                iterator.remove();
            }
        }
        int i1=0,i11=0;
        for (User user : all) {
            if (user.getType().equals("1"))
                i1++;
            else
                i11++;
        }
        model.addAttribute("i1",i1);
        model.addAttribute("i11",i11);

        List<Virus> list = virusService.findAll();
        list=where(list,whereVirus,startdate1);

        List<Integer> pie = new ArrayList<>();
        pie.add(list.size());

        pie.add(findByCollege(list,"数学学院"));
        pie.add(findByCollege(list,"计算机学院"));
        pie.add(findByCollege(list,"文学院"));
        pie.add(findByCollege(list,"外国语学院"));
        pie.add(findByCollege(list,"历史学院"));
        pie.add(findByCollege(list,"物理学院"));
        pie.add(findByCollege(list,"化学学院"));

        int i=0;
        for (Virus virus : list) {
            if (virus.getIschinesestudent())
                i++;
        }
        pie.add(i);
        i=0;
        for (Virus virus : list) {
            if (virus.getIswuhanstudent())
                i++;
        }
        pie.add(i);
        i=0;
        for (Virus virus : list) {
            if (virus.getIshubeistudent())
                i++;
        }
        pie.add(i);
        i=0;
        for (Virus virus : list) {
            if (virus.getIs14contact())
                i++;
        }
        pie.add(i);
        i=0;
        for (Virus virus : list) {
            if (virus.getIsinwuhan())
                i++;
        }
        pie.add(i);
        i=0;
        for (Virus virus : list) {
            if (virus.getIsinhubei())
                i++;
        }
        pie.add(i);
        i=0;
        for (Virus virus : list) {
            if (virus.getIstodayformother())
                i++;
        }
        pie.add(i);
        i=0;
        for (Virus virus : list) {
            if (virus.getIslikevirus())
                i++;
        }
        pie.add(i);
        i=0;
        for (Virus virus : list) {
            if (virus.getIsconfirmvirus())
                i++;
        }
        pie.add(i);
        model.addAttribute("pie", pie);
        System.out.println(pie);
        model.addAttribute("list", list);
        model.addAttribute("whereVirus", whereVirus);
        model.addAttribute("startdate1", startdate1);
        return "/page/virus/virusItem.jsp";
    }

    public int findByCollege(List<Virus> list,String college){
        int i=0;
        for (Virus virus : list) {
            if (virus.getCollege().equals(college))
                i++;
        }
        return i;
    }

    @RequestMapping("/saveById")
    public String saveById(Model model, Integer id) {
        Virus virus = virusService.findById(id);
        model.addAttribute("virus", virus);
        return "/page/virus/virusUpdate.jsp";
    }

    @RequestMapping("/deleteById")
    public String deleteById(Integer id) {
        virusService.deleteById(id);
        return "findAll";
    }

    @RequestMapping("/updateById")
    public String updateById(Virus virus) {
        virusService.updateById(virus);
        return "findAll";
    }

    @RequestMapping("/insert")
    public String insert(Virus virus, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user.getType().equals("1")){
            user.setType("11");
            userService.updateById(user);
        }
        virus.setStartdate(new Date());
        virusService.insertById(virus);


       if (user.getType().startsWith("1")){
           return "/success.jsp";
       }

        return "findAll";
    }
}