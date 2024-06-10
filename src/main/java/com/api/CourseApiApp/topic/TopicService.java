package com.api.CourseApiApp.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topcis = Arrays.asList(
            new Topic("spring", "spring framework", "desciption 1122"),
            new Topic("spring", "spring framework", "desciption 2"),
            new Topic("spring", "spring framework", "desciption 3")
    );

    public List<Topic> getAllTopics()
    {
        return topcis;
    }

    public topic 
}
