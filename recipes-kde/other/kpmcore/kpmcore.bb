SUMMARY = "Library for managing partitions"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING.md;md5=97a733ff40c50b4bfc74471e1f6ca88b"

inherit kde-base pkgconfig gettext

DEPENDS += " \
    kconfig-native \
    kauth-native \
    kcoreaddons-native \
    qca \
    ki18n \
    kiconthemes \
    kio \
    kservice \
    \
    parted \
    libatasmart \
"

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${PV}/src/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "b545a357cc348c84e8875531fdfe40fc63d915f03581e5004c4bd547d579514b"
PV = "4.1.0"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
