/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HMS.LocationService;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;

/**
 *
 * @author neerajraja
 */
public class WaypointService extends DefaultWaypoint {
    
    private String name;
    private JButton button;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public WaypointService(String name, IEventWaypoint event, GeoPosition coord) {
        super(coord);
        this.name = name;
        initButton(event);
    }

    public WaypointService() {
    }

    private void initButton(final IEventWaypoint event) {
        button = new LocationPointer();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                event.selected(WaypointService.this);
            }
        });
    }
}
