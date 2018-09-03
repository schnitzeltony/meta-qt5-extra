SUMMARY = "Lightweight Ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MITL;md5=5515af1f5ed2280bc0b7e56b600a9aa3"

SRC_URI = " \
    git://github.com/mruby/mruby.git \
    file://0001-Align-compile-to-our-needs.patch \
"
SRCREV = "023070a6396233974785a8fd5735b9380a884f27"
S = "${WORKDIR}/git"
PV = "1.4.1"

DEPENDS += " \
    bison-native \
    ruby-native \
"

do_install() {
    install -d ${D}/${bindir}
    cp ${B}/build/host/bin/* ${D}/${bindir}/

    install -d ${D}/${includedir}
    cp -r ${S}/include/* ${D}/${includedir}
}
