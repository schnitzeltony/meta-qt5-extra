SUMMARY = "KDE SystemLog Application"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5a3169a2d39a757efd8b7aa66a69d97b \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    kxmlgui \
    kcoreaddons \
    kwidgetsaddons \
    kitemviews \
    kio \
    kconfig \
    karchive \
    kdoctools \
    kcompletion \
    ktextwidgets \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "6f616feddc885ddae1099196b55f9108"
SRC_URI[sha256sum] = "26616e40595f64c3af774c5c74bb404e1af315d6a3f0d6a7ec3efe6a6d4457cf"

FILES_${PN} += "${datadir}/kxmlgui5"
