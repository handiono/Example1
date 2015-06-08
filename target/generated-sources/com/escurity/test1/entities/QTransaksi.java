package com.escurity.test1.entities;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QTransaksi is a Querydsl query type for Transaksi
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTransaksi extends EntityPathBase<Transaksi> {

    private static final long serialVersionUID = -1546841873L;

    public static final QTransaksi transaksi = new QTransaksi("transaksi");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath jenis = createString("jenis");

    public final SetPath<TransaksiBarang, QTransaksiBarang> transaksiBarangs = this.<TransaksiBarang, QTransaksiBarang>createSet("transaksiBarangs", TransaksiBarang.class, QTransaksiBarang.class, PathInits.DIRECT2);

    public QTransaksi(String variable) {
        super(Transaksi.class, forVariable(variable));
    }

    public QTransaksi(Path<? extends Transaksi> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTransaksi(PathMetadata<?> metadata) {
        super(Transaksi.class, metadata);
    }

}

