SUMMARY = "The image viewer and screenshot tool for LXQt"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt qt5-translation pkgconfig features_check gtk-icon-cache mime mime-xdg

DEPENDS += "qtx11extras qtsvg libfm-qt libexif libxfixes"

SRCREV = "1dc81f60412b9b584e0adf025373a78cc99500aa"
PV = "1.4.0"

FILES:${PN} += " \
    ${datadir}/icons \
    ${datadir}/metainfo \
"
