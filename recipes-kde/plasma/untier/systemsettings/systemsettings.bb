SUMMARY = "KDE system settings"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma

DEPENDS += " \
    kitemviews \
    kcmutils \
    ki18n \
    kio \
    kservice \
    kiconthemes \
    kwindowsystem \
    kxmlgui \
    kdbusaddons \
    kconfig \
    khtml \
    kdoctools \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "cf6b126c3365864348d1faa5eb43e9ba"
SRC_URI[sha256sum] = "c02375f6965b2c56c97aee58f70ca84e4ccb5e04c10a852bcb69c93981fd617a"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${libdir}/plugins \
"

FILES_${PN}-dbg += " \
    ${libdir}/plugins/.debug \
"
