SUMMARY = "A file metadata and text extraction library"
LICENSE = "MIT & LGPLv2+"
LIC_FILES_CHKSUM = " \
	file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
	file://COPYING.LGPL-2.1;md5=4fbd65380cdd255951079008b364516c \
	file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit kde-kf5 pkgconfig gettext

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9c025d95630d06225ea0199f00ef942c"
SRC_URI[sha256sum] = "7aeacfc538375dae4c8b3ab6411216a48a6971f012f1ab1b9d1e0f835429d6c9"
SRC_URI += " \
    file://0001-Revert-extractors-Hide-warnings-from-system-headers.patch \
    file://0002-Do-not-include-taglib-as-system-library.patch \
"

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
