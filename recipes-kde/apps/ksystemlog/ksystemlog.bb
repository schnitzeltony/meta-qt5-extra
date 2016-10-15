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
SRC_URI[md5sum] = "b906cf5b4570c74dfe568e375c1173f0"
SRC_URI[sha256sum] = "cb239ecf4964046d85504a1e48e63db8357cca2442abec6f63f298c3205b870a"

FILES_${PN} += "${datadir}/kxmlgui5"
