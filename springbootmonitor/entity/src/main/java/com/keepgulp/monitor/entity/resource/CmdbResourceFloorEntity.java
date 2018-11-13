package com.keepgulp.monitor.entity.resource;

import com.asura.framework.base.entity.BaseEntity;

/**
 * <p></p>
 * <p/>
 * <PRE>
 * <BR>
 * <BR>-----------------------------------------------
 * <BR>
 * </PRE>
 *
 * @author zhaozq14
 * @version 1.0
 * @date 2016-07-28 11:31:32
 * @since 1.0
 */
public class CmdbResourceFloorEntity extends BaseEntity {

    private String lastModifyTime;

    public String getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }


    /**
     * This field corresponds to the database column cmdb_resource_floor.floor_id
     * Comment: 机房编号
     * @param floorId the value for cmdb_resource_floor.floor_id
     */

    private Integer floorId;


    /**
     * This field corresponds to the database column cmdb_resource_floor.floor_name
     * Comment: 机房楼层名称
     * @param floorName the value for cmdb_resource_floor.floor_name
     */

    private String floorName;


    /**
     * This field corresponds to the database column cmdb_resource_floor.floor_address
     * Comment: 机房楼层地址
     * @param floorAddress the value for cmdb_resource_floor.floor_address
     */

    private String floorAddress;


    /**
     * This field corresponds to the database column cmdb_resource_floor.create_time
     * Comment: 创建时间
     * @param createTime the value for cmdb_resource_floor.create_time
     */

    private Integer createTime;


    /**
     * This field corresponds to the database column cmdb_resource_floor.create_user
     * Comment: 创建人
     * @param createUser the value for cmdb_resource_floor.create_user
     */

    private String createUser;


    /**
     * This field corresponds to the database column cmdb_resource_floor.last_modify_user
     * Comment: 最近修改用户
     * @param lastModifyUser the value for cmdb_resource_floor.last_modify_user
     */

    private String lastModifyUser;


    /**
     * This field corresponds to the database column cmdb_resource_floor.floor_id
     * Comment: 机房编号
     * @param floorId the value for cmdb_resource_floor.floor_id
     */
    public void setFloorId(Integer floorId){
       this.floorId = floorId;
    }

    /**
     * This field corresponds to the database column cmdb_resource_floor.floor_name
     * Comment: 机房楼层名称
     * @param floorName the value for cmdb_resource_floor.floor_name
     */
    public void setFloorName(String floorName){
       this.floorName = floorName;
    }

    /**
     * This field corresponds to the database column cmdb_resource_floor.floor_address
     * Comment: 机房楼层地址
     * @param floorAddress the value for cmdb_resource_floor.floor_address
     */
    public void setFloorAddress(String floorAddress){
       this.floorAddress = floorAddress;
    }

    /**
     * This field corresponds to the database column cmdb_resource_floor.create_time
     * Comment: 创建时间
     * @param createTime the value for cmdb_resource_floor.create_time
     */
    public void setCreateTime(Integer createTime){
       this.createTime = createTime;
    }

    /**
     * This field corresponds to the database column cmdb_resource_floor.create_user
     * Comment: 创建人
     * @param createUser the value for cmdb_resource_floor.create_user
     */
    public void setCreateUser(String createUser){
       this.createUser = createUser;
    }

    /**
     * This field corresponds to the database column cmdb_resource_floor.last_modify_user
     * Comment: 最近修改用户
     * @param lastModifyUser the value for cmdb_resource_floor.last_modify_user
     */
    public void setLastModifyUser(String lastModifyUser){
       this.lastModifyUser = lastModifyUser;
    }

    /**
     * This field corresponds to the database column cmdb_resource_floor.floor_id
     * Comment: 机房编号
     * @return the value of cmdb_resource_floor.floor_id
     */
     public Integer getFloorId() {
        return floorId;
    }

    /**
     * This field corresponds to the database column cmdb_resource_floor.floor_name
     * Comment: 机房楼层名称
     * @return the value of cmdb_resource_floor.floor_name
     */
     public String getFloorName() {
        return floorName;
    }

    /**
     * This field corresponds to the database column cmdb_resource_floor.floor_address
     * Comment: 机房楼层地址
     * @return the value of cmdb_resource_floor.floor_address
     */
     public String getFloorAddress() {
        return floorAddress;
    }

    /**
     * This field corresponds to the database column cmdb_resource_floor.create_time
     * Comment: 创建时间
     * @return the value of cmdb_resource_floor.create_time
     */
     public Integer getCreateTime() {
        return createTime;
    }

    /**
     * This field corresponds to the database column cmdb_resource_floor.create_user
     * Comment: 创建人
     * @return the value of cmdb_resource_floor.create_user
     */
     public String getCreateUser() {
        return createUser;
    }

    /**
     * This field corresponds to the database column cmdb_resource_floor.last_modify_user
     * Comment: 最近修改用户
     * @return the value of cmdb_resource_floor.last_modify_user
     */
     public String getLastModifyUser() {
        return lastModifyUser;
    }
}
