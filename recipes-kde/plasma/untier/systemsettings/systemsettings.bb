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
SRC_URI[md5sum] = "ced252789e97fbcce179faccb6aeb7c3"
SRC_URI[sha256sum] = "d146bd8988b77f187409dbab81b1de31f2c83a1d179ad32b7116d80a5d055838"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
