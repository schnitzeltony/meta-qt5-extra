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
SRC_URI[md5sum] = "d095f506f375d0e7fae65d4ec2d4237b"
SRC_URI[sha256sum] = "3bc1571e8aae59ae7738aa1ff3b2d363895a359711363f18e4bf20c9172df9bb"

FILES_${PN} += "${datadir}/kxmlgui5"
