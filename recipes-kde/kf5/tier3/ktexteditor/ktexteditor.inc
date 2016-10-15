SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet libgit2"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2388a9287023572beacabad74a50f1fd"
SRC_URI[sha256sum] = "5a875dd81593edef3b359e778f7e2a7685f4ba73780bbb9469538bf31ab9fc88"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
