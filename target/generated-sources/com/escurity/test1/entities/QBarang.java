package com.escurity.test1.entities;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QBarang is a Querydsl query type for Barang
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QBarang extends EntityPathBase<Barang> {

    private static final long serialVersionUID = -1645304832L;

    public static final QBarang barang = new QBarang("barang");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath partname = createString("partname");

    public final StringPath partno = createString("partno");

    public final SetPath<TransaksiBarang, QTransaksiBarang> transaksiBarangs = this.<TransaksiBarang, QTransaksiBarang>createSet("transaksiBarangs", TransaksiBarang.class, QTransaksiBarang.class, PathInits.DIRECT2);

    public QBarang(String variable) {
        super(Barang.class, forVariable(variable));
    }

    public QBarang(Path<? extends Barang> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBarang(PathMetadata<?> metadata) {
        super(Barang.class, metadata);
    }

}

