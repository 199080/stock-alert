package com.ljq.stock.alert.model.param.message;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 预警消息分页查询
 *
 * @author junqiang.lu
 * @date 2021-03-22 17:17:06
 */
@Data
@ApiModel(value = "预警消息分页查询", description = "预警消息分页查询")
public class AlertMessageListParam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     * */
    @NotNull(message = "id 不能为空")
    @Min(value = 1, message = "id 至少为 1")
    @ApiModelProperty(value = "id 不能为空,至少为 1", name = "id", required = true, example = "0")
    private Long id;



}
