SUMMARY = "Rubber Band Library library for audio time-stretching and pitch-shifting"
HOMEPAGE = "http://breakfastquay.com/rubberband/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=45422928b8a498b809772c5bac1ba4ed"

inherit autotools-brokensep pkgconfig

DEPENDS = "libsndfile1"

SRC_URI = " \
    https://code.soundsoftware.ac.uk/attachments/download/1520/${BPN}-${PV}.tar.gz \
    file://0001-do-not-perform-test-it-tries-to-run-cross-binaries.patch \
"
SRC_URI[md5sum] = "200d6f5980d8d8877d296975a7e2890b"
SRC_URI[sha256sum] = "d0d3578137ac0c1e63f31561081a8d61da526a81152bc1dc9383b629bc07f85f"

do_comile() {
    oe_runmake sdk plugins host rdfgen
}

FILES_${PN} += "${libdir}/vamp"
