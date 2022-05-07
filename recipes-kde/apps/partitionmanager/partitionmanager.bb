SUMMARY = "KDE Partition Manage"
LICENSE = "CC0-1.0 & CC-BY-SA-4.0 & GFDL-1.2+ & GPL-3.0-or-later & LGPL-3.0-or-later & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/CC-BY-4.0.txt;md5=28bacf04b75cbad10cb7871e0b063188 \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=ad1419ecc56e060eccf8184a87c4285f \
    file://LICENSES/GPL-3.0-or-later.txt;md5=d32239bcb673463ab874e80d47fae504 \
    file://LICENSES/LGPL-3.0-or-later.txt;md5=3000208d539ec061b899bce1d9ce9404 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

inherit kde-apps pkgconfig gtk-icon-cache

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcrash \
    kdoctools-native \
    kcoreaddons-native \
    ki18n \
    kiconthemes \
    kjobwidgets \
    kio \
    kservice \
    kxmlgui \
    kwidgetsaddons \
    kpmcore \
    \
    libatasmart \
    util-linux \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "782867dce91d2c70bda5e743041c2ccd37938f697b932d96efd20daaf8eb901a"

FILES:${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${datadir}/appdata \
    ${datadir}/solid \
"
