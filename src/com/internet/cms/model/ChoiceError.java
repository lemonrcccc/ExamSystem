package com.internet.cms.model;

public class ChoiceError extends PageInfo{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column choice_error.question_id
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    private Integer questionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column choice_error.question_name
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    private String questionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column choice_error.question_type
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    private Integer questionType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column choice_error.question_state
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    private Integer questionState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column choice_error.question_option_a
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    private String questionOptionA;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column choice_error.question_option_b
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    private String questionOptionB;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column choice_error.question_option_c
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    private String questionOptionC;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column choice_error.question_option_d
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    private String questionOptionD;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column choice_error.correct_option
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    private String correctOption;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column choice_error.point_id
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    private Integer pointId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column choice_error.point_name
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    private String pointName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column choice_error.subject_id
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    private Integer subjectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column choice_error.subject_name
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    private String subjectName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column choice_error.student_id
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    private Integer studentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column choice_error.student_name
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    private String studentName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column choice_error.question_id
     *
     * @return the value of choice_error.question_id
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column choice_error.question_id
     *
     * @param questionId the value for choice_error.question_id
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column choice_error.question_name
     *
     * @return the value of choice_error.question_name
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public String getQuestionName() {
        return questionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column choice_error.question_name
     *
     * @param questionName the value for choice_error.question_name
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public void setQuestionName(String questionName) {
        this.questionName = questionName == null ? null : questionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column choice_error.question_type
     *
     * @return the value of choice_error.question_type
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public Integer getQuestionType() {
        return questionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column choice_error.question_type
     *
     * @param questionType the value for choice_error.question_type
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column choice_error.question_state
     *
     * @return the value of choice_error.question_state
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public Integer getQuestionState() {
        return questionState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column choice_error.question_state
     *
     * @param questionState the value for choice_error.question_state
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public void setQuestionState(Integer questionState) {
        this.questionState = questionState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column choice_error.question_option_a
     *
     * @return the value of choice_error.question_option_a
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public String getQuestionOptionA() {
        return questionOptionA;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column choice_error.question_option_a
     *
     * @param questionOptionA the value for choice_error.question_option_a
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public void setQuestionOptionA(String questionOptionA) {
        this.questionOptionA = questionOptionA == null ? null : questionOptionA.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column choice_error.question_option_b
     *
     * @return the value of choice_error.question_option_b
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public String getQuestionOptionB() {
        return questionOptionB;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column choice_error.question_option_b
     *
     * @param questionOptionB the value for choice_error.question_option_b
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public void setQuestionOptionB(String questionOptionB) {
        this.questionOptionB = questionOptionB == null ? null : questionOptionB.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column choice_error.question_option_c
     *
     * @return the value of choice_error.question_option_c
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public String getQuestionOptionC() {
        return questionOptionC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column choice_error.question_option_c
     *
     * @param questionOptionC the value for choice_error.question_option_c
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public void setQuestionOptionC(String questionOptionC) {
        this.questionOptionC = questionOptionC == null ? null : questionOptionC.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column choice_error.question_option_d
     *
     * @return the value of choice_error.question_option_d
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public String getQuestionOptionD() {
        return questionOptionD;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column choice_error.question_option_d
     *
     * @param questionOptionD the value for choice_error.question_option_d
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public void setQuestionOptionD(String questionOptionD) {
        this.questionOptionD = questionOptionD == null ? null : questionOptionD.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column choice_error.correct_option
     *
     * @return the value of choice_error.correct_option
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public String getCorrectOption() {
        return correctOption;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column choice_error.correct_option
     *
     * @param correctOption the value for choice_error.correct_option
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public void setCorrectOption(String correctOption) {
        this.correctOption = correctOption == null ? null : correctOption.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column choice_error.point_id
     *
     * @return the value of choice_error.point_id
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public Integer getPointId() {
        return pointId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column choice_error.point_id
     *
     * @param pointId the value for choice_error.point_id
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column choice_error.point_name
     *
     * @return the value of choice_error.point_name
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public String getPointName() {
        return pointName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column choice_error.point_name
     *
     * @param pointName the value for choice_error.point_name
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public void setPointName(String pointName) {
        this.pointName = pointName == null ? null : pointName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column choice_error.subject_id
     *
     * @return the value of choice_error.subject_id
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public Integer getSubjectId() {
        return subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column choice_error.subject_id
     *
     * @param subjectId the value for choice_error.subject_id
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column choice_error.subject_name
     *
     * @return the value of choice_error.subject_name
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column choice_error.subject_name
     *
     * @param subjectName the value for choice_error.subject_name
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column choice_error.student_id
     *
     * @return the value of choice_error.student_id
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column choice_error.student_id
     *
     * @param studentId the value for choice_error.student_id
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column choice_error.student_name
     *
     * @return the value of choice_error.student_name
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column choice_error.student_name
     *
     * @param studentName the value for choice_error.student_name
     *
     * @mbggenerated Wed Apr 26 12:47:31 CST 2017
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }
}