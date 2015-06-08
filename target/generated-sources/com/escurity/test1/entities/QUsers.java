package com.escurity.test1.entities;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QUsers is a Querydsl query type for Users
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUsers extends EntityPathBase<Users> {

    private static final long serialVersionUID = -312097841L;

    public static final QUsers users = new QUsers("users");

    public final StringPath enable = createString("enable");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath password = createString("password");

    public final StringPath username = createString("username");

    public final SetPath<UserRoles, QUserRoles> userRoless = this.<UserRoles, QUserRoles>createSet("userRoless", UserRoles.class, QUserRoles.class, PathInits.DIRECT2);

    public QUsers(String variable) {
        super(Users.class, forVariable(variable));
    }

    public QUsers(Path<? extends Users> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUsers(PathMetadata<?> metadata) {
        super(Users.class, metadata);
    }

}

