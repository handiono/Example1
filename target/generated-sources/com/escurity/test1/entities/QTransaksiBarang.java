package com.escurity.test1.entities;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QTransaksiBarang is a Querydsl query type for TransaksiBarang
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTransaksiBarang extends EntityPathBase<TransaksiBarang> {

    private static final long serialVersionUID = 316567222L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTransaksiBarang transaksiBarang = new QTransaksiBarang("transaksiBarang");

    public final QBarang barang;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> quantity = createNumber("quantity", Long.class);

    public final DateTimePath<java.util.Date> tanggal = createDateTime("tanggal", java.util.Date.class);

    public final QTransaksi transaksi;

    public QTransaksiBarang(String variable) {
        this(TransaksiBarang.class, forVariable(variable), INITS);
    }

    public QTransaksiBarang(Path<? extends TransaksiBarang> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTransaksiBarang(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTransaksiBarang(PathMetadata<?> metadata, PathInits inits) {
        this(TransaksiBarang.class, metadata, inits);
    }

    public QTransaksiBarang(Class<? extends TransaksiBarang> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.barang = inits.isInitialized("barang") ? new QBarang(forProperty("barang")) : null;
        this.transaksi = inits.isInitialized("transaksi") ? new QTransaksi(forProperty("transaksi")) : null;
    }

}

