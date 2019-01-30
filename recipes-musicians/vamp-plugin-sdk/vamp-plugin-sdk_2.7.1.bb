SUMMARY = "The Vamp audio analysis plugin system - SDK"
HOMEPAGE = "http://www.vamp-plugins.org/develop.html"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=af2765066122f0233483605ef6d299fa"

inherit autotools-brokensep pkgconfig

DEPENDS = "libsndfile1"

SRC_URI = " \
    https://code.soundsoftware.ac.uk/attachments/download/2206/${BPN}-${PV}.tar.gz \
    file://0001-do-not-perform-test-it-tries-to-run-cross-binaries.patch \
"
SRC_URI[md5sum] = "41129f07c252dd721ea81ef0265777fd"
SRC_URI[sha256sum] = "c6fef3ff79d2bf9575ce4ce4f200cbf219cbe0a21cfbad5750e86ff8ae53cb0b"

do_compile() {
    oe_runmake sdk plugins host rdfgen
}

do_install() {
    oe_runmake 'DESTDIR=${D}' 'INSTALL_SDK_LIBS=${libdir}' 'INSTALL_PLUGINS=${libdir}/vamp' 'INSTALL_PKGCONFIG=${libdir}/pkgconfig' install
}

FILES_${PN} += "${libdir}/vamp"
