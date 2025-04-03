package com.uttkarsh.ProdReadyFeatures.auth;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;
//Audit Aware-> used to get the name of the current used, who did the changes(audits)
public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
//        get security context
//        get authentication
//        get the principle
//        get the username
        return Optional.of("Uttkarsh");
    }
}
