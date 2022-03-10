SUMMARY = "The image viewer and screenshot tool for LXQt"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt qt5-translation pkgconfig features_check gtk-icon-cache mime mime-xdg

DEPENDS += "qtx11extras qtsvg libfm-qt libexif libxfixes"

SRCREV = "38fe36cee2c3ea1819fba8ab6f3798bd6d418e48"
PV = "1.0.0"

FILES:${PN} += "${datadir}/icons"
