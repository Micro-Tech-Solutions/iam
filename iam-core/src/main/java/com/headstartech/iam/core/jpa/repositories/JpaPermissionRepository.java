package com.headstartech.iam.core.jpa.repositories;

import com.headstartech.iam.core.jpa.entities.PermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface JpaPermissionRepository extends JpaRepository<PermissionEntity, String>, JpaSpecificationExecutor {
}
