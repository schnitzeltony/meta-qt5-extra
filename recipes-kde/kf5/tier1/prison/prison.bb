SUMMARY = "Barcode abstraction layer"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=02744127548d68b579a51bda5af08e2b \
"

inherit kde-kf5

DEPENDS += " \
    qrencode \
    libdmtx \
"

SRC_URI[md5sum] = "dfc717b8fe63f3167d8bfea6f97b1ae6"
SRC_URI[sha256sum] = "2d354ad8e262cfc6fa5f43c68a3231aa3dfc621f904a1f15a09aa0697afaf736"

PV = "${KF5_VERSION}"
