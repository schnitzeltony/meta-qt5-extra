SUMMARY = "KMENUEDIT"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma

DEPENDS += " \
    ki18n \
    kxmlgui \
    kdbusaddons \
    kiconthemes \
    kio \
    sonnet \
    kdelibs4support \
"

# REVISIT optionals
DEPENDS += " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "khotkeys", "",d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "14a7f1be6dacb5caf47364554496c3c6"
SRC_URI[sha256sum] = "41f4aa6ee77318d64a228fd4c501707af771266744fe5b032d22557c85264164"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${libdir}/libkdeinit5_kmenuedit.so \
"
