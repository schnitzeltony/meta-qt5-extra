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

SRC_URI[md5sum] = "3547776a9e99793e206e047e5170196b"
SRC_URI[sha256sum] = "85ffbf88aa02bbecadd88572f035c72c932d3329a0aedcc91994572c64a9f36a"

PV = "${KF5_VERSION}"
