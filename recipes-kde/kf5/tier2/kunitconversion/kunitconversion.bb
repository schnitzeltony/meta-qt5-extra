SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e301ff355e446d8c1bc0a11c915f9024"
SRC_URI[sha256sum] = "6c538b35e727f75e90178b6b5b17d299a3ce797bd82a6adb0af4e41096eb6082"
