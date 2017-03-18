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
SRC_URI[md5sum] = "472d92127f8e908ed2bc1210986768a4"
SRC_URI[sha256sum] = "712a22bf3649079a8c3db2900ed7e58abc31f2021d04ff4c0e8aa029c0bda675"

FILES_${PN} += "${datadir}/kxmlgui5"
