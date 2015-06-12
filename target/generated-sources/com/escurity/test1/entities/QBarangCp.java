package com.escurity.test1.entities;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QBarangCp is a Querydsl query type for BarangCp
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QBarangCp extends EntityPathBase<BarangCp> {

    private static final long serialVersionUID = -589976435L;

    public static final QBarangCp barangCp = new QBarangCp("barangCp");

    public final NumberPath<Long> barang_id = createNumber("barang_id", Long.class);

    public final StringPath partname = createString("partname");

    public final StringPath partno = createString("partno");

    public QBarangCp(String variable) {
        super(BarangCp.class, forVariable(variable));
    }

    public QBarangCp(Path<? extends BarangCp> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBarangCp(PathMetadata<?> metadata) {
        super(BarangCp.class, metadata);
    }

}

