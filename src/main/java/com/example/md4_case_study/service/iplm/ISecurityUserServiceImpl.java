package com.example.md4_case_study.service.iplm;


import com.example.md4_case_study.model.AppUser;
import com.example.md4_case_study.model.PasswordResetToken;
import com.example.md4_case_study.repository.PasswordResetTokenRepository;
import com.example.md4_case_study.service.ISecurityUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Calendar;
@Service
public class ISecurityUserServiceImpl implements ISecurityUserService {
//    xác thực id user và mã token
    @Autowired
    private PasswordResetTokenRepository passwordTokenRepository;
    @Override
    public String validatePasswordResetToken(long id, String token) {
        final PasswordResetToken passToken = passwordTokenRepository.findByToken(token);
        if ((passToken == null) || (passToken.getAppUser().getIdUser() != id)) {
            return "invalidToken";
        }

        final Calendar cal = Calendar.getInstance();
        if ((passToken.getExpiryDate().getTime() - cal.getTime().getTime()) <= 0) {
            return "expired";
        }
///// VALID USER LOGIN
//        final AppUser appUser = passToken.getAppUser();
//        final Authentication auth = new UsernamePasswordAuthenticationToken(appUser, null, Arrays.asList(new SimpleGrantedAuthority("CHANGE_PASSWORD_PRIVILEGE")));
//        SecurityContextHolder.getContext().setAuthentication(auth);
        return null;
    }
}
