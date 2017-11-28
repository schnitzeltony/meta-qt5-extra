SUMMARY = "Symas Lightning Memory-Mapped Database (LMDB)"
HOMEPAGE = "http://symas.com/mdb/"
LICENSE = "OLDAP-2.8"
LIC_FILES_CHKSUM = "file://LICENSE;md5=153d07ef052c4a37a8fac23bc6031972"

SRC_URI = " \
    git://github.com/LMDB/lmdb.git;branch=mdb.RE/0.9 \
    file://0001-Patch-the-main-Makefile.patch \
"
SRCREV = "60d500206a108b2c64ca7e36b0113b2cd3711b98"
S = "${WORKDIR}/git/libraries/liblmdb"

inherit autotools-brokensep


do_compile() {
    oe_runmake "CC=${CC}"
}

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    install -d ${D}${mandir}
    sed -i 's:\$(prefix)/man:${mandir}:' Makefile
    oe_runmake DESTDIR=${D} prefix=${prefix} libprefix=${libdir} manprefix=${mandir} install
    chown -R root:root ${D}${bindir}
    chown -R root:root ${D}${libdir}
}
