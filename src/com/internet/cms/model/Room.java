package com.internet.cms.model;

public class Room extends PageInfo{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.room_id
     *
     * @mbggenerated Sun Apr 09 17:20:02 CST 2017
     */
    private Integer roomId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.room_name
     *
     * @mbggenerated Sun Apr 09 17:20:02 CST 2017
     */
    private String roomName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.room_state
     *
     * @mbggenerated Sun Apr 09 17:20:02 CST 2017
     */
    private Integer roomState;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.room_id
     *
     * @return the value of room.room_id
     *
     * @mbggenerated Sun Apr 09 17:20:02 CST 2017
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.room_id
     *
     * @param roomId the value for room.room_id
     *
     * @mbggenerated Sun Apr 09 17:20:02 CST 2017
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.room_name
     *
     * @return the value of room.room_name
     *
     * @mbggenerated Sun Apr 09 17:20:02 CST 2017
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.room_name
     *
     * @param roomName the value for room.room_name
     *
     * @mbggenerated Sun Apr 09 17:20:02 CST 2017
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.room_state
     *
     * @return the value of room.room_state
     *
     * @mbggenerated Sun Apr 09 17:20:02 CST 2017
     */
    public Integer getRoomState() {
        return roomState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.room_state
     *
     * @param roomState the value for room.room_state
     *
     * @mbggenerated Sun Apr 09 17:20:02 CST 2017
     */
    public void setRoomState(Integer roomState) {
        this.roomState = roomState;
    }
}