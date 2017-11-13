package com.springcloud.user.service;


import com.springcloud.user.api.IUserService;
import com.springcloud.user.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author cks
 * @Date 2017/7/19.
 */
@Service
public class UserService implements IUserService {
//    @Autowired
//    private UserMapper userMapper;

    public void add(User user) {

    }


//    @Override
//    public void add(User user) {
//        user.setPassword(BCryptUtil.hashpw(SHAUtils.SHA256(user.getPassword()), BCryptUtil.gensalt()));
//        Date now = new Date();
//        user.setCreateTime(now);
//        user.setUpdateLastTime(now);
//        userMapper.insertUser(user);
//    }

    /**
     * 记录用户token并添加到cookie
     *
     * @param uid 用户id
     *            //     * @param systemType 系统类型
     */
//    public String addUserToken(Long uid) {
//
//        UserToken userToken = new UserToken();
//        userToken.setUid(uid);
//        userToken.setToken(CommonUtil.genUUID(false));
//
//        userToken.setCreateTime(new Date());
//        userToken.setStatus(true);
//
//        long currentTime = System.currentTimeMillis();
//        currentTime += 30 * 60 * 1000;
//        userToken.setExpiryTime(new Date(currentTime));
//        // TODO 先写死后期优化
//        userToken.setSystemType(Constants.SYSTEM_PLATFORM_WORKSHOP);
//        userTokenMapper.insertUserToken(userToken);
//        return userToken.getToken();
//    }

//    public Object[] login(String userName, String password, HttpServletRequest request) {
//
//        User user = userMapper.findByUsername(userName);
//        String token = addUserToken(Long.valueOf(user.getId()));
//        if (!user.getPassword().equals(password)) {
//            return null;
//        }
//        return new Object[]{user, token};
//    }
}
