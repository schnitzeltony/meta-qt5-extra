SUMMARY = "Qt Node Editor. Dataflow programming framework"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3dd210d444241389c4e5dff1f84e7c10"

SRC_URI = "git://github.com/paceholder/nodeeditor.git"
SRCREV = "5ad2aaf21f8d241c9e03d9a291709824ae3f75ed"
PV = "2.1.2"
S = "${WORKDIR}/git"

inherit cmake_qt5

EXTRA_OECMAKE += " \
    -DBUILD_EXAMPLES=ON \
    -DCMAKE_SKIP_BUILD_RPATH=ON \
"

do_install_append() {
    install -d ${D}${bindir}
    install -m 755 ${B}/bin/* ${D}${bindir}
}

FILES_SOLIBSDEV = ""
FILES_${PN} += "${libdir}/libnodes.so"

PACKAGES =+ "${PN}-examples"
FILES_${PN}-examples = "${bindir}"
