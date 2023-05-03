package com.example.demo;

import com.example.demo.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topicList = new ArrayList<>(Arrays.asList(
            new Topic("001C","Esari","Undergraduate-UCSC"),
            new Topic("002C","Piyumi","Undergraduate - IT"),
            new Topic("003C","Buddhima","Undergraduate - SLITT")

            ));

    public List<Topic> getAllTopicList() {
        return topicList;
    }
}
