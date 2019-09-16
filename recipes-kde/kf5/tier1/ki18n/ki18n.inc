SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "bdb2fa3857f70a9415314a0850d55a1f"
SRC_URI[sha256sum] = "b11a0c94c7149798f3f6592e2c386a682d9c528d1e10a59ed3934a93acbc79cb"
