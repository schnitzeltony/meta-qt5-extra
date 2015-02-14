SUMMARY = "LXQt system settings center"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig

DEPENDS += "qtx11extras glib-2.0 libexif pcmanfm-qt libxfixes"

SRCREV = "d5a14991463bc01186914f489dfcb47bc772a3e2"
PV = "0.3.0"

SRC_URI += "file://0001-src-CMakeLists.txt-do-not-completely-overwrite-CMAKE.patch"

EXTRA_OECMAKE += "-DUSE_QT5=ON"

FILES_${PN} += "${datadir}/icons"
