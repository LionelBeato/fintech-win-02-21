package com.tts.day4.bigo;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

public class LineGraphChart extends ApplicationFrame {

    public static final long serialVersionUUID = 8024827403766653799L;

    public static void main(String[] args) {
        final LineGraphChart demo = new LineGraphChart("Big O Notations");
        demo.pack();
        demo.setVisible(true);
    }

    private XYPlot plot;

    public LineGraphChart(String title) {
        super(title);

        final XYDataset dataset1 = createRandomDataset("O(1)", readCoordinates(FileNameConstants.CONSTANT_TIME));
        final JFreeChart chart = ChartFactory.createXYLineChart("Big O Notations", "Input Size", "Value", dataset1,
                PlotOrientation.VERTICAL, true, true, false);
        chart.setBackgroundPaint(Color.white);

        this.plot = chart.getXYPlot();
        this.plot.setBackgroundPaint(Color.lightGray);
        this.plot.setDomainGridlinePaint(Color.white);
        this.plot.setRangeGridlinePaint(Color.white);
        final ValueAxis axis = this.plot.getDomainAxis();
        axis.setAutoRange(true);

        final NumberAxis rangeAxis2 = new NumberAxis("Range Axis 2");
        rangeAxis2.setAutoRangeIncludesZero(false);

        final JPanel content = new JPanel(new BorderLayout());

        final ChartPanel chartPanel = new ChartPanel(chart);
        content.add(chartPanel);

        chartPanel.setPreferredSize(new java.awt.Dimension(700, 500));
        setContentPane(content);

        this.plot.setDataset(1, createRandomDataset("O(n)", readCoordinates(FileNameConstants.LINEAR_TIME)));
        this.plot.setRenderer(1, new StandardXYItemRenderer());
        this.plot.setDataset(2, createRandomDataset("O(logn)", readCoordinates(FileNameConstants.LOG_TIME)));
        this.plot.setRenderer(2, new StandardXYItemRenderer());
        this.plot.setDataset(3, createRandomDataset("O(n^2)", readCoordinates(FileNameConstants.POLY_TIME)));
        this.plot.setRenderer(3, new StandardXYItemRenderer());
    }

    private XYDataset createRandomDataset(final String label, Map<Long, Long> xyCoordinates) {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series = new XYSeries(label);

        xyCoordinates.forEach((k, v) -> {
            series.add(k, v);
        });

        dataset.addSeries(series);
        return dataset;
    }

    private Map<Long, Long> readCoordinates(String filename) {
        Map<Long, Long> xyCoordinates = new HashMap<>();
        try {
            File data = new File(filename);
            Files.readAllLines(data.toPath(), Charset.defaultCharset()).forEach(s -> {
                System.out.println(s);
                String[] values = s.split(",");
                xyCoordinates.put(Long.valueOf(values[0]), Long.valueOf(values[1]));
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return xyCoordinates;
    }

}
