package com.escurity.test1.entities;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QUserRoles is a Querydsl query type for UserRoles
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUserRoles extends EntityPathBase<UserRoles> {

    private static final long serialVersionUID = 2022986745L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserRoles userRoles = new QUserRoles("userRoles");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath role = createString("role");

    public final QUsers users;

    public QUserRoles(String variable) {
        this(UserRoles.class, forVariable(variable), INITS);
    }

    public QUserRoles(Path<? extends UserRoles> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUserRoles(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUserRoles(PathMetadata<?> metadata, PathInits inits) {
        this(UserRoles.class, metadata, inits);
    }

    public QUserRoles(Class<? extends UserRoles> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.users = inits.isInitialized("users") ? new QUsers(forProperty("users")) : null;
    }

}

