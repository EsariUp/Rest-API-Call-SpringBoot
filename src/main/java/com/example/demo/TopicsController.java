package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicsController {
    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
    public List<Topic> all_topics(){
        return topicService.getAllTopicList();
    }
}
