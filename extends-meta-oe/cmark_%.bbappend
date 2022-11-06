BBCLASSEXTEND = "native"

DEPENDS:append:class-target = "${BPN}-native"

sysroot_stage_all:append:class-target () {
    mkdir -p ${SYSROOT_DESTDIR}${bindir}
    cp ${STAGING_BINDIR_NATIVE}/cmark ${SYSROOT_DESTDIR}${bindir}
}

