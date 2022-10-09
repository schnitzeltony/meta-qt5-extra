SUMMARY = "A C implementation of John Gruber’s Markdown text to html language"
HOMEPAGE = "https://www.pell.portland.or.us/~orc/Code/discount/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=4fce0411d71254cfa33e28dba1458f18"

SRC_URI = " \
    https://www.pell.portland.or.us/~orc/Code/${BPN}/${BPN}-${PV}.tar.bz2 \
    file://0001-Do-not-run-ldconfig.patch \
    file://0002-Avoid-stripping-during-install.patch \
    file://0003-fixldflags.patch \
"
SRC_URI:append:class-target = " \
    file://0004-Do-not-build-use-cross-config.sed.patch \
    file://0005-Use-native-mktags.patch \
    file://0006-Use-native-branch.patch \
"
PV = "2.2.7b"
SRC_URI[sha256sum] = "b9368cc2063831635f9e790d0c4c338c2b4b72658cdc244323241bfcddf6ffd5"

inherit autotools-brokensep pkgconfig

DEPENDS += " \
    ${BPN}-native \
"

do_configure() {
    ./configure.sh \
        --shared \
        --prefix=${prefix} \
        --execdir=${bindir} \
        --libdir=${libdir} \
        --mandir=${mandir} \
        --enable-all-features \
        --with-fenced-code \
        --pkg-config
}

do_install:append:class-native() {
    for exec in branch cols config.sed echo mktags; do
        install ${B}/$exec ${D}${bindir}
    done
}

BBCLASSEXTEND = "native"
