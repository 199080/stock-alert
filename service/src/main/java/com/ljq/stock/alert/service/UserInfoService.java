package com.ljq.stock.alert.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.ljq.stock.alert.model.entity.UserInfoEntity;
import com.ljq.stock.alert.model.param.user.*;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * 用户信息业务层接口
 * 
 * @author junqiang.lu
 * @date 2021-03-22 17:17:06
 */
public interface UserInfoService {

	/**
     * 新增(单条)
     *
     * @param saveParam
     * @return
     */
	UserInfoEntity save(UserInfoSaveParam saveParam);

	/**
	 * 获取验证码
	 *
	 * @param checkCodeParam
	 */
	void getCheckCode(UserGetCheckCodeParam checkCodeParam);

	/**
	 * 用户注册
	 *
	 * @param registerParam
	 * @return
	 * @throws JsonProcessingException
	 */
	UserInfoEntity register(UserRegisterParam registerParam) throws JsonProcessingException;

	/**
	 * 用户登录
	 *
	 * @param loginParam
	 * @return
	 * @throws JsonProcessingException
	 */
	UserInfoEntity login(UserLoginParam loginParam) throws JsonProcessingException;

	/**
     * 查询详情(单条)
     *
     * @param infoParam
     * @return
     */
	UserInfoEntity info(UserInfoInfoParam infoParam);

	/**
     * 分页查询
     *
     * @param listParam
     * @return
     */
	IPage<UserInfoEntity> page(UserInfoListParam listParam);

	/**
     * 更新(单条)
     *
     * @param updateParam
     * @return
     */
	void update(UserInfoUpdateParam updateParam);

	/**
     * 删除(单条)
     *
     * @param deleteParam
     * @return
     */
	void delete(UserInfoDeleteParam deleteParam);

	/**
     * 批量删除
     *
     * @param deleteBatchParam
     * @return
     */
	void deleteBatch(UserInfoDeleteBatchParam deleteBatchParam);



}
