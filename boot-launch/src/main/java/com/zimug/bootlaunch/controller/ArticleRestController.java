package com.zimug.bootlaunch.controller;



import com.zimug.bootlaunch.generator.testdb.*;

import com.zimug.bootlaunch.model.AjaxResponse;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Example;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


@Slf4j
@Controller
@RequestMapping("/rest")
@ComponentScan(basePackages = {"com.zimug.bootlaunch"})

public class ArticleRestController {

    //@Resource(name="articleMybatisRestServiceImpl")

    //ArticleRestService articleRestService;
    /*@Resource
  ZhangRestService zhangRestService;*/
    @Resource
    ArticleDao articleDao;
    @Resource
    PictureDao pictureDao;
    @Resource
    SingdateDao singdateDao;
    @Resource
    MiddleDao middleDao;
    @Resource
    CommentDao commentDao;
    @Resource
    CommentmiddleDao commentmiddleDao;


    @ApiOperation(value = "添加文章", notes = "添加新的文章", tags = "ArticleVO",httpMethod = "POST")
    @ApiResponses({
            @ApiResponse(code=200,message="成功",response=AjaxResponse.class),
            @ApiResponse(code=400,message="用户输入错误",response=AjaxResponse.class),
            @ApiResponse(code=500,message="系统内部错误",response=AjaxResponse.class)
    })
    //@RequestMapping(value = "/article", method = POST, produces = "application/json")
    /*@PostMapping("/article")
    public @ResponseBody  AjaxResponse saveArticle(@RequestBody ArticleVO article) {
    *//*public @ResponseBody  AjaxResponse saveArticle(@RequestParam String  id,
                                                   @RequestParam String  author) {*//*

        log.info("saveArticle：{}",article);

        //log.info("articleRestService return :" + articleRestService.saveArticle(article));

        return  AjaxResponse.success(article);
    }*/

    //@RequestMapping(value = "/article/{id}", method = DELETE, produces = "application/json")
   /* @DeleteMapping("/article/{id}")
    public @ResponseBody AjaxResponse deleteArticle(@PathVariable Long id) {

      //  articleRestService.deleteArticle(id);

        return AjaxResponse.success(id);
    }*/

    //@RequestMapping(value = "/article/{id}", method = PUT, produces = "application/json")
    /*@PutMapping("/article/{id}")
    public @ResponseBody AjaxResponse updateArticle(@PathVariable Long id, @RequestBody ArticleVO article) {
        article.setId(id);

   //     articleRestService.updateArticle(article)reader;

        return AjaxResponse.success(article);
    }*/

    //@RequestMapping(value = "/article/{id}", method = GET, produces = "application/json")
    /*@GetMapping( "/article/{id}")
    public @ResponseBody  AjaxResponse getArticle(@PathVariable Long id) {
        //return AjaxResponse.success(articledao.selectPhoneById(Math.toIntExact(id)));
        return AjaxResponse.success(articleRestService.getArticle(id));
    }*/
    @GetMapping( "/article/{id}")
    public @ResponseBody  AjaxResponse geArticleanpricte(@PathVariable Long id) {
        return AjaxResponse.success(articleDao.selectByExample(null));
        //return AjaxResponse.success(articleRestService.getArticle(id));
    }


    //@RequestMapping(value = "/article/{id}", method = GET, produces = "application/json")
    @GetMapping( "/article")
    public @ResponseBody AjaxResponse getAll(Long offset,int Limit) {
        //System.out.println(articleDao.selectByExample(null).toString());
        ArticleExample example = new ArticleExample();
        example.setOffset(offset);
        example.setLimit(Limit);
        example.setOrderByClause("aid desc");




        return AjaxResponse.success(articleDao.selectByExample(example));


    }


    @RequestMapping("/upload")
    public @ResponseBody AjaxResponse upload(@RequestParam("myimage")MultipartFile file,@RequestParam("id")int id, HttpServletRequest request, HttpServletResponse response) throws IllegalStateException, IOException {
        //String path = request.getSession().getServletContext().getRealPath("upload");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式  HH:mm:ss
        String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
        String path = "D:/springboot/uploaded_files/"+date+"/";
        UUID uuid=UUID.randomUUID();
        String originalFilename = file.getOriginalFilename();

        // String fileName = uuid.toString() + originalFilename;
        String extendName = originalFilename.substring(originalFilename.lastIndexOf("."), originalFilename.length());
        String fileName = uuid.toString() + extendName;
        File dir = new File(path, fileName);
        File filepath = new File(path);
        if(!filepath.exists()){
            filepath.mkdirs();
        }
        file.transferTo(dir);
        Picture picture = new Picture();
        String str = "http://192.168.43.152:8888/image/"+date+"\\"+fileName;
        picture.setAddress(str.replace("\\","/"));
System.out.println(request.getParameterMap()+"fdsafdsafffffffffffffffffffffffffffffffffffffff");


         int myid = pictureDao.insert(picture);
               /*Comment comment = new Comment();
               comment.setComment("好帅a");
               comment.setNickname("xiaofjds");
               comment.setTonickname("fdslfjakl");*/
              /* Article article = new Article();
               article.setAuthor(author);
        articleDao.insert(article);*/
              Commentmiddle commentmiddle = new Commentmiddle();
              commentmiddle.setCmAid(id);
              commentmiddle.setCmMid(1);

             commentmiddleDao.insert(commentmiddle);
        Middle middle = new Middle();
        middle.setmAid(id);
        middle.setmPid(picture.getPid());
        middleDao.insert(middle);
        return AjaxResponse.success(myid);


    }
    @GetMapping( "/singdate")
    public @ResponseBody AjaxResponse getsingdateAll() {
        //System.out.println(articleDao.selectByExample(null).toString());
        return AjaxResponse.success(singdateDao.selectByExample(null));


    }
    @PostMapping("/singdate")
    public @ResponseBody  AjaxResponse saveArticle(
        @RequestParam String  date) {

        Singdate singdate = new Singdate();
        singdate.setDate(date);

            //log.info("articleRestService return :" + articleRestService.saveArticle(article));

            return  AjaxResponse.success(singdateDao.insert(singdate));
        }

//    @PostMapping("/article")
//    public @ResponseBody  AjaxResponse saveArticle(@RequestBody Article article) {
//
//
//        articleDao.insert(article);
//
//        return  AjaxResponse.success(article.getAid());
//    }

}