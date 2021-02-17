package com.original.admin.demo.admin.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name="ums_admin")
@ApiModel(value="UmsAdmin Object", description="user list")
public class UmsAdmin {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="username")
    private String userName;

    @Column(name="password")
    private String password;

    @Column(name="icon")
    @ApiModelProperty(value="icon")
    private String icon;

    @Column(name="email")
    @ApiModelProperty(value="email")
    private String email;

    @Column(name="nick_name")
    @ApiModelProperty(value="nikc name")
    private String nickName;

    @Column(name="note")
    @ApiModelProperty(value="note")
    private String note;

    @Column(name="create_time")
    @ApiModelProperty(value="create time")
    private String createTime;

    @Column(name="login_time")
    @ApiModelProperty(value="login time")
    private String loginTime;

    @Column(name="status")
    @ApiModelProperty(value="status 0 for inactive 1 for active")
    private String status;
}
