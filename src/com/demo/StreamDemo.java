package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamDemo {
    public void StreamTest()
    {
        List<StudentScore> studentScoreList=new ArrayList<>();
        List<FilterScore> filterScoreList=new ArrayList<>();
        StudentScore studentScore1=new StudentScore();
        studentScore1.setName("张三");
        studentScore1.setCourse("语文");
        studentScore1.setScore(90);
        StudentScore studentScore2=new StudentScore();
        studentScore2.setName("张三");
        studentScore2.setCourse("数学");
        studentScore2.setScore(89);
        StudentScore studentScore3=new StudentScore();

        studentScore3.setName("李四");
        studentScore3.setCourse("语文");
        studentScore3.setScore(92);
        StudentScore studentScore4=new StudentScore();

        studentScore4.setName("李四");
        studentScore4.setCourse("数学");
        studentScore4.setScore(80);
        StudentScore studentScore5=new StudentScore();

        studentScore5.setName("王五");
        studentScore5.setCourse("语文");
        studentScore5.setScore(95);
        StudentScore studentScore6=new StudentScore();

        studentScore6.setName("王五");
        studentScore6.setCourse("数学");
        studentScore6.setScore(96);
        studentScoreList.add(studentScore1);
        studentScoreList.add(studentScore2);
        studentScoreList.add(studentScore3);
        studentScoreList.add(studentScore4);
        studentScoreList.add(studentScore5);
        studentScoreList.add(studentScore6);

        StudentScore studentScore7=new StudentScore();

        studentScore7.setName("赵六");
        studentScore7.setCourse("语文");
        studentScore7.setScore(94);
        StudentScore studentScore8=new StudentScore();

        studentScore8.setName("赵六");
        studentScore8.setCourse("数学");
        studentScore8.setScore(98);
        studentScoreList.add(studentScore7);
        studentScoreList.add(studentScore8);


        FilterScore filterScore1=new FilterScore();
        filterScore1.setCourse("语文");
        filterScore1.setScore(90);
        FilterScore filterScore2=new FilterScore();
        filterScore2.setCourse("数学");

        filterScore2.setScore(90);
        filterScoreList.add(filterScore1);
        filterScoreList.add(filterScore2);

//        List<String> filteredNames = studentScoreList.stream()
//                .filter(score -> filterScoreList.stream()
//                        .filter(filter -> filter.getCourse().equals(score.getCourse()))
//                        .allMatch(filter -> score.getScore() >= filter.getScore()))
//                .map(StudentScore::getName)
//                .distinct()
//                .collect(Collectors.toList());

//       List<String> studentScores=new ArrayList<>();
//
//        for(StudentScore studentScore:studentScoreList)
//        {
//            Boolean flag=true;
//            for(FilterScore filterScore:filterScoreList)
//            {
//                if(studentScore.getCourse().equals(filterScore.getCourse())&&studentScore.getScore()>=filterScore.getScore())
//                {
//                    flag=true;
//                }
//                else
//                {
//                    flag=false;
//                }
//            }
//            if(flag)
//            {
//                studentScores.add(studentScore.getName());
//            }
//        }

//List<String> collect=studentScoreList.stream().filter(studentScore -> {
//    return  filterScoreList.stream().allMatch(filterScore -> {
//    return  studentScore.getCourse().equals(filterScore.getCourse())&&studentScore.getScore()>=filterScore.getScore();});}).map(studentScore -> {return studentScore.getName();}).collect(Collectors.toList());

//        List<String> filteredNames = studentScoreList.stream()
//                .filter(score -> filterScoreList.stream()
//                        .anyMatch(filter -> filter.getCourse().equals(score.getCourse()) && filter.getScore() <= score.getScore()))
//                .map(StudentScore::getName)
//                .distinct()
//                .collect(Collectors.toList());

        List<String> result = studentScoreList.stream()
                .collect(Collectors.groupingBy(StudentScore::getCourse))
                .values()
                .stream()
                .map(studentCourseGroup -> {
                    return studentCourseGroup.stream().filter(studentScore -> {
                        return filterScoreList.stream().anyMatch(filterScore -> {
                            return Objects.equals(studentScore.getCourse(), filterScore.getCourse()) && studentScore.getScore() >= filterScore.getScore();
                        });
                    }).map(StudentScore::getName).collect(Collectors.toList());
                })
                .reduce((names1, names2) -> names1.stream().filter(names2::contains).collect(Collectors.toList()))
                .orElse(Collections.emptyList());

        System.out.println(result);

    }
    public class StudentScore
    {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        private String name;
        private String course;
        private Integer score;
    }
   public class FilterScore
   {
       public String getCourse() {
           return course;
       }

       public void setCourse(String course) {
           this.course = course;
       }

       public Integer getScore() {
           return score;
       }

       public void setScore(Integer score) {
           this.score = score;
       }

       private String course;
       private Integer score;
   }
}
