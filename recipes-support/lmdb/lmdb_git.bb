SUMMARY = "Symas Lightning Memory-Mapped Database (LMDB)"
HOMEPAGE = "http://symas.com/mdb/"
LICENSE = "OLDAP-2.8"
LIC_FILES_CHKSUM = "file://LICENSE;md5=153d07ef052c4a37a8fac23bc6031972"

SRC_URI = " \
    git://github.com/LMDB/lmdb.git;nobranch=1;protocol=https \
    file://0001-Patch-the-main-Makefile.patch \
"
SRCREV = "8ad7be2510414b9506ec9f9e24f24d04d9b04a1a"
S = "${WORKDIR}/git/libraries/liblmdb"
PV = "0.9.29"

do_compile() {
    oe_runmake "CC=${CC}"
}

do_install() {
    oe_runmake DESTDIR=${D} prefix=${prefix} libdir=${libdir} mandir=${mandir} install
    chown -R root:root ${D}${bindir}
    chown -R root:root ${D}${libdir}
}
