package com.qfedu.ams.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.ChoiceQuestion;
import com.qfedu.ams.entity.JudgeQuestion;
import com.qfedu.ams.entity.ShortQuestion;
import com.qfedu.ams.service.ChoiceQuestionService;
import com.qfedu.ams.service.JudgeQuestiomSevice;
import com.qfedu.ams.service.ShortQuestionSevice;
import com.qfedu.ams.utils.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

@Controller
public class UpFileController {

    @Autowired
    private ShortQuestionSevice shortQuestionSevice;

    @Autowired
    private JudgeQuestiomSevice judgeQuestiomSevice;

    @Autowired
    private ChoiceQuestionService choiceQuestionService;

    @RequestMapping("/admin/SQ/upfile.do")
    public String SQimportExcel(@RequestParam MultipartFile upfile) {
        List<ShortQuestion> list1 = null;
        // 获取上传文件的输入流对象
        try {
            InputStream inputStream = upfile.getInputStream();

            String filename = upfile.getOriginalFilename();

            List<Map<String, Object>> list = ExcelUtils.readExcel(filename, inputStream);

            ObjectMapper objectMapper = new ObjectMapper();
            String jsonStr = objectMapper.writeValueAsString(list);
            // 将json格式的字符串转为指定类型的对象
            list1 = objectMapper.readValue(jsonStr, new TypeReference<List<ShortQuestion>>() {
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
        shortQuestionSevice.inserts(list1);
        return "redirect:/SCexcel.html";
    }

    @RequestMapping("/admin/JQ/upfile.do")
    public String JQimportExcel(@RequestParam MultipartFile upfile) {
        List<JudgeQuestion> list2 = null;
        // 获取上传文件的输入流对象
        try {
            InputStream inputStream = upfile.getInputStream();

            String filename = upfile.getOriginalFilename();

            List<Map<String, Object>> list = ExcelUtils.readExcel(filename, inputStream);

            ObjectMapper objectMapper = new ObjectMapper();
            String jsonStr = objectMapper.writeValueAsString(list);
            // 将json格式的字符串转为指定类型的对象
            list2 = objectMapper.readValue(jsonStr, new TypeReference<List<JudgeQuestion>>() {
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
        judgeQuestiomSevice.inserts(list2);
        return "redirect:/SCexcel.html";
    }

    @RequestMapping("/admin/CQ/upfile.do")
    public String CQimportExcel(@RequestParam MultipartFile upfile) {
        List<ChoiceQuestion> list2 = null;
        // 获取上传文件的输入流对象
        try {
            InputStream inputStream = upfile.getInputStream();

            String filename = upfile.getOriginalFilename();

            List<Map<String, Object>> list = ExcelUtils.readExcel(filename, inputStream);

            ObjectMapper objectMapper = new ObjectMapper();
            String jsonStr = objectMapper.writeValueAsString(list);
            // 将json格式的字符串转为指定类型的对象
            list2 = objectMapper.readValue(jsonStr, new TypeReference<List<ChoiceQuestion>>() {
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
        choiceQuestionService.inserts(list2);
        return "redirect:/SCexcel.html";
    }
}
