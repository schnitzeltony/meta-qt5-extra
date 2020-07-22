SUMMARY = "A file metadata and text extraction library"
LICENSE = "MIT & LGPLv2+"
LIC_FILES_CHKSUM = " \
	file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
	file://COPYING.LGPL-2.1;md5=4fbd65380cdd255951079008b364516c \
	file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit kde-kf5 pkgconfig gettext

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0b3b6828348b0c053641b0278dde3c33"
SRC_URI[sha256sum] = "6f93d0b5dedb3beffbb7626130707a3b11522c58b3081e3b539dbeb9fbd3d1c3"

# TODO: optionals PACKAGECONFIG (poppler-qt5 / exiv2 / ffmpeg / epub)
DEPENDS += " \
    qtmultimedia \
    lmdb \
    kconfig-native \
    kcoreaddons-native \
    kcoreaddons \
    ki18n \
    karchive \
    libav \
    poppler \
    taglib \
    exiv2 \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/kf5"

RRECOMMENDS_${PN} += "catdoc"
