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
SRC_URI[md5sum] = "f0c968985aeff4dcac54a5d70b054d67"
SRC_URI[sha256sum] = "c492b03c19b86d0ca5422ac9913d19af73c152e952b3a39e1e4daef672246845"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${libdir}/plugins \
"

FILES_${PN}-dbg += " \
    ${libdir}/plugins/.debug \
"
