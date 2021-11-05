package com.ljq.stock.alert.model.param.message;

import com.ljq.stock.alert.model.BasePageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * 预警消息分页查询
 *
 * @author junqiang.lu
 * @date 2021-03-22 17:17:06
 */
@Data
@ToString(callSuper = true)
@ApiModel(value = "预警消息分页查询", description = "预警消息分页查询")
public class AlertMessageListParam extends BasePageParam {

    private static final long serialVersionUID = 1L;

    /**
     * 用户信息
     * */
    @Min(value = 1, message = "用户信息ID至少为1")
    @ApiModelProperty(value = "用户信息 不能为空,至少为 1", name = "userId", example = "0")
    private Long userId;
    /**
     * 手机发送,1-发送成功,2-发送失败,3-未发送
     * */
    @Min(value = 1, message = "手机提醒发送状态设置错误")
    @Max(value = 3, message = "手机提醒发送状态设置错误")
    @ApiModelProperty(value = "手机发送,1-发送成功,2-发送失败,3-未发送 不能为空,至少为 1", name = "phoneSend", example = "0")
    private Integer phoneSend;
    /**
     * 邮箱发送,1-发送成功,2-发送失败,3-未发送
     * */
    @Min(value = 1, message = "邮箱提醒发送状态设置错误")
    @Max(value = 3, message = "邮箱提醒发送状态设置错误")
    @ApiModelProperty(value = "邮箱发送,1-发送成功,2-发送失败,3-未发送 不能为空,至少为 1", name = "emailSend", example = "0")
    private Integer emailSend;
    /**
     * 股票 id
     * */
    @Min(value = 1, message = "股票 id 至少为 1")
    @ApiModelProperty(value = "股票 id 不能为空,至少为 1", name = "stockId", example = "0")
    private Long stockId;
    /**
     * 消息标题
     */
    @Length(max = 64, message = "消息标题需要控制在 64 支付以内")
    @ApiModelProperty(value = "消息标题", name = "title")
    private String title;
    /**
     * 消息内容
     * */
    @Length(max = 64, message = "消息内容需要控制在 64 字符以内")
    @ApiModelProperty(value = "消息内容", name = "content")
    private String content;



}
