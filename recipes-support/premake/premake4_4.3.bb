SUMMARY = "A simple build configuration and project generation tool using lua"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6f3a39cc652afb51d2f2bc39b67e308f"
HOMEPAGE = "http://premake.github.io/"

#    https://downloads.sourceforge.net/project/premake/Premake/4.3/premake-4.3-src.zip

SRC_URI = " \
    http://downloads.sourceforge.net/project/premake/Premake/${PV}/premake-${PV}-src.zip \
    file://0001-Premake4.make-keep-more-of-our-build-defaults.patch \
"
SRC_URI[md5sum] = "8cfafee76f9665c93b2e9ad15b015eb7"
SRC_URI[sha256sum] = "36536490f8928d8ecde135da80cd8b751ea5bebe50cabba5c0de49cd41cb2780"
S = "${WORKDIR}/premake-${PV}"

BBCLASSEXTEND = "native"

do_compile_prepend() {
    cd ${S}/build/gmake.unix
}

do_install() {
    install -d ${D}${bindir}
    install -m 755 ${S}/bin/release/premake4 ${D}${bindir}
}


